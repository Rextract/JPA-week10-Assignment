package org.example.JPAweek10Assignment.data;

import org.example.JPAweek10Assignment.model.entity.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class IngredientDAORepository implements IngredientDAO{


    private final EntityManager em;

    @Autowired
    public IngredientDAORepository(EntityManager em) {
        this.em = em;
    }


    @Override
    public List<Ingredient> findByNameIgnoreCase(String ingredientName) {
        return null;
    }

    @Override
    public List<Ingredient> findByNameIgnoreCaseJPQL(Integer ingredientName) {
        return null;
    }

    @Override
    public List<Ingredient> findAllByIngredientName(String ingredientName) {
        return null;
    }

    @Override
    public List<Ingredient> findAllByIngredientNameJPQL(Integer ingredientName) {
        return null;
    }

    @Override
    public List<Ingredient> findAll() {
        return null;
    }

    @Override
    public List<Ingredient> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Ingredient> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Ingredient> findAllById(Iterable<String> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Ingredient ingredient) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> iterable) {

    }

    @Override
    public void deleteAll(Iterable<? extends Ingredient> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Ingredient> S save(S s) {
        return null;
    }

    @Override
    public <S extends Ingredient> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Ingredient> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Ingredient> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public <S extends Ingredient> List<S> saveAllAndFlush(Iterable<S> iterable) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Ingredient> iterable) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Ingredient getOne(String s) {
        return null;
    }

    @Override
    public Ingredient getById(String s) {
        return null;
    }

    @Override
    public <S extends Ingredient> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Ingredient> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Ingredient> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Ingredient> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Ingredient> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Ingredient> boolean exists(Example<S> example) {
        return false;
    }
}
