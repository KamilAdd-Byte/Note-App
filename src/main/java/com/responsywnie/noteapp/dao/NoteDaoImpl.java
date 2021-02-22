package com.responsywnie.noteapp.dao;

import com.responsywnie.noteapp.model.Note;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class NoteDaoImpl implements NoteDao {

    @Override
    public List<Note> getAllNote() {
        return findAll();
    }

    @Override
    public void addNote(Note note) {
        getAllNote().add(note);
    }

    @Override
    public void deleteNote(Note note) {
        getAllNote().remove(note);
    }

    @Override
    public <S extends Note> S save(S s) {
        return null;
    }

    @Override
    public <S extends Note> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Note> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Note> findAll() {
        return new ArrayList<>();
    }

    @Override
    public Iterable<Note> findAllById(Iterable<Long> iterable) {
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
    public void delete(Note note) {

    }

    @Override
    public void deleteAll(Iterable<? extends Note> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Note> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Note> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Note> S insert(S s) {
        return null;
    }

    @Override
    public <S extends Note> List<S> insert(Iterable<S> iterable) {
        return null;
    }

    @Override
    public <S extends Note> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Note> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Note> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Note> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Note> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Note> boolean exists(Example<S> example) {
        return false;
    }
}
