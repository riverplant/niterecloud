package com.nitere.cloud.production;

import com.nitere.cloud.production.domain.dto.BrandDto;
import com.nitere.cloud.production.service.BrandService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
public class NitereCloudProductionApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void save() {

        BrandDto dto = BrandDto.builder()
                .id(1L)
                .name("Apple")
                .logoUrl("https://xxx/logo.png")
                .description("蘋果手機")
                .status(1)
                .firstLetter("A")
                .sort(0)
                .build();

        brandService.create(dto);

        System.out.println("保存成功");

    }

    @Test
    void testBrandPage() {
        var page = brandService.pageBrands(1, 10);
        System.out.println("total elements = " + page.getTotalElements());
    }

    @Test
    void updateBrand_idExistant_valeursModifiees() {
        // 1. 先新增一筆
        BrandDto createDto = BrandDto.builder()
                .name("TestBrand")
                .logoUrl("http://logo1.png")
                .description("before update")
                .status(1)
                .firstLetter("T")
                .sort(0)
                .build();

        BrandDto saved = brandService.create(createDto);

        // 2. 修改這筆資料
        BrandDto updateDto = BrandDto.builder()
                .name("NewName")
                .logoUrl("http://logo2.png")
                .description("after update")
                .status(0)
                .firstLetter("N")
                .sort(5)
                .build();

        BrandDto updated = brandService.update(saved.getId(), updateDto);

        // 3. 從 DB 再查一次確認
        BrandDto fromDb = brandService.getById(saved.getId());

        assertThat(updated.getId()).isEqualTo(saved.getId());
        assertThat(fromDb.getName()).isEqualTo("NewName");
        assertThat(fromDb.getLogoUrl()).isEqualTo("http://logo2.png");
        assertThat(fromDb.getDescription()).isEqualTo("after update");
        assertThat(fromDb.getStatus()).isEqualTo(0);
        assertThat(fromDb.getFirstLetter()).isEqualTo("N");
        assertThat(fromDb.getSort()).isEqualTo(5);
    }
}
