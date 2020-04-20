package com.ims.controller;

import com.ims.dao.BookDao;

import com.ims.model.Book;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * 图书控制器
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @Resource
    private BookDao bookDao;

    /**
     * 查询所有图书
     *
     * @return
     */
    @RequestMapping("/list")
    public ModelAndView list() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("bookList", bookDao.findAll());
        mav.setViewName("bookList");
        return mav;
    }

    /**
     * 添加图书
     *
     * @param book
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(Book book) {
        bookDao.save(book);
        return "forward:/book/list";
    }

    /**
     * 根据id查询book实体
     *
     * @param id
     * @return
     */
    @RequestMapping("/preUpdate/{id}")
    public ModelAndView preUpdate(@PathVariable("id") Integer id) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("book", bookDao.getOne(id));
        mav.setViewName("bookUpdate");
        return mav;
    }

    /**
     * 修改图书
     *
     * @param book
     * @return
     */
    @PostMapping(value = "/update")
    public String update(Book book) {
        bookDao.save(book);
        return "forward:/book/list";
    }

    /**
     * 删除图书
     *
     * @param id
     * @return
     */
    @GetMapping("/delete")
    public String delete(Integer id) {
        bookDao.deleteById(id);
        return "forward:/book/list";
    }

    /**
     * 使用@query查询
     * @return
     */
    @ResponseBody
    @GetMapping("/queryByName")
    public List<Book> queryByName() {
        return bookDao.findByName("王");
    }
    /**
     * 使用@query查询
     * @return
     */
    @ResponseBody
    @GetMapping("/randomList")
    public List<Book> randomList() {
        return bookDao.randomList(2);
    }

    /**
     * 根据条件动态查询
     * @param book
     * @return
     */
    @RequestMapping("/search")
    public ModelAndView search(Book book){
        ModelAndView mav=new ModelAndView();
        List<Book> bookList=bookDao.findAll(new Specification<Book>() {
            @Override
            public Predicate toPredicate(Root<Book> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                Predicate predicate=cb.conjunction();
                if(book!=null){
                    if(book.getName()!=null && !"".equals(book.getName())){
                        predicate.getExpressions().add(cb.like(root.get("name"), "%"+book.getName()+"%"));
                    }
                    if(book.getAuthor()!=null && !"".equals(book.getAuthor())){
                        predicate.getExpressions().add(cb.like(root.get("author"), "%"+book.getAuthor()+"%"));
                    }
                }
                return predicate;
            }
        });
        mav.addObject("bookList", bookList);
        mav.setViewName("bookList");
        return mav;
    }
}
