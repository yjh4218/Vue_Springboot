package com.vue_spring.demo.service;

import com.vue_spring.demo.model.Inspect;
import com.vue_spring.demo.model.Maker;
import com.vue_spring.demo.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public interface MakerService {


    public Optional<List<Maker>> findMaker(String skuNo, String productName,
                                             String brandName, String maker, Set<String> tempBusinessType);

    public Boolean insertMaker(Maker maker);

    public Boolean updateMaker(Maker maker);

    public Boolean checkId(long makerId);

    public Boolean deleteMaker(long id);
}
