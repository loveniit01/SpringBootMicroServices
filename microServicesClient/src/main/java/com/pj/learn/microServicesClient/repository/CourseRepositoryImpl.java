package com.pj.learn.microServicesClient.repository;

import com.pj.learn.microServicesClient.model.Users;
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
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

public class CourseRepositoryImpl implements CourseRepository{
@Autowired
    EntityManager entityManager;

    @Override
    public List<Users> findAll() {

        CriteriaBuilder cb =  entityManager.getCriteriaBuilder();
        CriteriaQuery<Users> select  = cb.createQuery(Users.class);
        Root<Users> from =  select.from(Users.class);
        select.select(from);
        TypedQuery<Users> typedQuery = entityManager.createQuery(select);
        List<Users> allUsers = typedQuery.getResultList();
        return allUsers;
    }

    @Override
    public List<Users> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Users> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Users> findAllById(Iterable<BigInteger> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(BigInteger bigInteger) {

    }

    @Override
    public void delete(Users users) {

    }

    @Override
    public void deleteAll(Iterable<? extends Users> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Users> S save(S s) {
        return null;
    }

    @Override
    public <S extends Users> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Users> findById(BigInteger bigInteger) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(BigInteger bigInteger) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Users> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Users> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Users getOne(BigInteger bigInteger) {
        return null;
    }

    @Override
    public <S extends Users> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Users> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Users> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Users> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Users> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Users> boolean exists(Example<S> example) {
        return false;
    }
}
