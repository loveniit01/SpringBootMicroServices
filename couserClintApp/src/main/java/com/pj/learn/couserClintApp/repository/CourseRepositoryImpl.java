package com.pj.learn.couserClintApp.repository;

import com.pj.learn.couserClintApp.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;

public class CourseRepositoryImpl implements CourseRepository{
    @Autowired
    EntityManager em;

    @Override
    public List<Course> findAll() {

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Course> select =  cb.createQuery(Course.class);
        Root<Course> from  =  select.from(Course.class);
        select.select(from);

        TypedQuery<Course> typedQuery =em.createQuery(select);
        List<Course> data = typedQuery.getResultList();

        return data;
    }

    @Override
    public List<Course> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Course> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Course> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Course course) {

    }

    @Override
    public void deleteAll(Iterable<? extends Course> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Course> S save(S s) {
        return null;
    }

    @Override
    public <S extends Course> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Course> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Course> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Course> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Course getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends Course> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Course> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Course> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Course> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Course> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Course> boolean exists(Example<S> example) {
        return false;
    }
}
