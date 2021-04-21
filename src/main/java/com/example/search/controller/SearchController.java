package com.example.search.controller;

import com.example.search.dto.SectionDTO;
import com.example.search.service.ISearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RequiredArgsConstructor
//@RestController
public abstract class SearchController<T> {

    protected final ISearchService<T> iNICICOSearchService;

    @PostMapping(value = "/search")
    public ResponseEntity<List<T>> search(@RequestBody SectionDTO sectionDTO) {
        return new ResponseEntity<>(iNICICOSearchService.search(sectionDTO), HttpStatus.OK);
    }
}
