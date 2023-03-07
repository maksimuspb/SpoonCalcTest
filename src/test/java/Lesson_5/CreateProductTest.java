package Lesson_5;

import Lesson_5.Api.ProductService;
import Lesson_5.DTO.Product;
import Lesson_5.Util.RetrofitUtils;
import jdk.jfr.Category;
import lombok.SneakyThrows;
import okhttp3.ResponseBody;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.*;
import retrofit2.Response;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;

public class CreateProductTest {
    static ProductService productService;
    Product product = null;
    Faker faker = new Faker();
    int id;

    @BeforeAll
    static void beforeAll() {
        productService = RetrofitUtils.getRetrofit()
                .create(ProductService.class);
    }

    @BeforeEach
    void setUp() {
        product = new Product()
                .withTitle(faker.food().ingredient())
                .withCategoryTitle("Food")
                .withPrice((int) (Math.random() * 10000));
    }

    @Test
    void createProductInFoodCategoryTest() throws IOException {
        Response<Product> response = productService.createProduct(product)
                .execute();
        id = response.body().getId();
        assertThat(response.isSuccessful(), CoreMatchers.is(true));
    }

    @SneakyThrows
    @AfterEach
    void tearDown() {
        Response<ResponseBody> response = productService.deleteProduct(id).execute();
        assertThat(response.isSuccessful(), CoreMatchers.is(true));
    }

    @Test
    void testGetProduct() throws IOException {

        product = new Product()
                .id(7)
                .title("Meat balls")
                .categoryTitle(Category.food().getTitle())
                .price(15L)
                .build();


        Response<Product> response = api.getProduct(dto.getId()).execute();
        Long id = response.body().getId();





    }
    @Test

    void testDeleteProduct() throws IOException {

        product  = new Product()
                .title("Meat balls")
                .categoryTitle(Category.food.getTitle())
                .price(15L)
                .build();

        Response<Product> response = api.createProduct(dto).execute();

        Long id = response.body().getId();

        api.deleteProduct(id).execute();

        api.getProduct(id).execute();


    }
}

