package org.itstep.springshop;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Crud {
    @Autowired
    private
    MockMvc mvc;

    @Test
    @Order(1)
    public void getArtist() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/artist")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", Matchers.hasSize(10)))
                .andExpect(jsonPath("$[0].name", Matchers.equalTo("AC/DC")));
    }


    @Test
    @Order(2)
    public void getArtistById() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/artist/1")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", notNullValue()))
                .andExpect(jsonPath("$.name", Matchers.equalTo("AC/DC")));
    }


    @Test
    @Order(3)
    public void postArtist() throws Exception {
        mvc.perform(
                        MockMvcRequestBuilders.post

                                        ("/artist")
                                .content(asJsonString(new Artist(1L, "user1")))
                                .contentType(MediaType.APPLICATION_JSON)
                                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", notNullValue()));
    }

    @Test
    @Order(4)
    public void putArtist() throws Exception {
        mvc.perform(
                        MockMvcRequestBuilders.put
                                        ("/artist/2")
                                .content(asJsonString(new Artist(4L, "user4")))
                                .contentType(MediaType.APPLICATION_JSON)
                                .accept(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", notNullValue()))
                .andExpect(status().isOk());
        //.andExpect(jsonPath("$.price", Matchers.equalTo(1.)));
    }


    @Test
    @Order(5)
    public void deleteArtist() throws Exception {
        mvc.perform(MockMvcRequestBuilders.delete("/artist/2"))
                .andExpect(status().isOk());
    }

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    @Order(6)
    public void getAlbum() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/album")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", Matchers.hasSize(10)))
                .andExpect(jsonPath("$[4].title", Matchers.equalTo("Chippin_In")));
    }

    @Test
    @Order(7)
    public void getAlbumById() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/album/5")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", notNullValue()))
                .andExpect(jsonPath("$.title", Matchers.equalTo("Chippin_In")));
    }

    @Test
    @Order(8)
    public void postAlbum() throws Exception {
        mvc.perform(
                        MockMvcRequestBuilders.post
                                        ("/album")
                                .content(asJsonString(new Album(1L, "user2", 4L)))
                                .contentType(MediaType.APPLICATION_JSON)
                                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", notNullValue()));
    }

    @Test
    @Order(9)
    public void putAlbum() throws Exception {
        mvc.perform(
                        MockMvcRequestBuilders.put
                                        ("/album/3")
                                .content(asJsonString(new Album(50L, "user5", 10L)))
                                .contentType(MediaType.APPLICATION_JSON)
                                .accept(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", notNullValue()))
                .andExpect(status().isOk());
        //.andExpect(jsonPath("$.price", Matchers.equalTo(1.)));
    }

    @Test
    @Order(10)
    public void deleteAlbum() throws Exception {
        mvc.perform(MockMvcRequestBuilders.delete("/album/3"))
                .andExpect(status().isOk());
    }

    @Test
    @Order(11)
    public void getCustomer() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/customer")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", Matchers.hasSize(10)))
                .andExpect(jsonPath("$[5].last_name", Matchers.equalTo("Holy")));
    }

    @Test
    @Order(12)
    public void getCustomerById() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/customer/7")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", notNullValue()))
                .andExpect(jsonPath("$.last_name", Matchers.equalTo("Gruber")));
    }

    @Test
    //@Disabled
    @Order(13)
    public void postCustomer() throws Exception {
        mvc.perform(
                        MockMvcRequestBuilders.post
                                        ("/customer")
.content(asJsonString(new Customer(1L, "Johnny", "Silverhand", "24kGoldn", "Av Brigadeiro Faria Lima 2170", "San Hose", "CP", "Rock Country", "60614", "+66 (23) 4034-6666")))
                                .contentType(MediaType.APPLICATION_JSON)
                                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", notNullValue()));
    }

    @Test
 //   @Disabled
    @Order(14)
    public void putCustomer() throws Exception {
        mvc.perform(
                        MockMvcRequestBuilders.put
                                        ("/customer/4")
.content(asJsonString(new Customer(1L, "Johnny", "Silverhand", "24kGoldn", "Av Brigadeiro Faria Lima 2170", "San Hose", "CP", "Rock Country", "60614", "+66 (23) 4034-6666")))
                                .contentType(MediaType.APPLICATION_JSON)
                                .accept(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", notNullValue()))
                .andExpect(status().isOk());
    }

    @Test
    @Order(15)
    public void deleteCustomer() throws Exception {
        mvc.perform(MockMvcRequestBuilders.delete("/customer/5"))
                .andExpect(status().isOk());
    }

    ////
    @Test
    @Order(16)
    public void getInvoice() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/invoice")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", Matchers.hasSize(10)))
                .andExpect(jsonPath("$[9].billing_city", Matchers.equalTo("Vienna")));
    }

    @Test
    @Order(17)
    public void getInvoiceById() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/invoice/9")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", notNullValue()))
                .andExpect(jsonPath("$.billing_city", Matchers.equalTo("Prague")));
    }

    @Test
    @Order(18)
    public void postInvoice() throws Exception {
        mvc.perform(
                        MockMvcRequestBuilders.post
                                        ("/invoice")
.content(asJsonString(new Invoice((1L),2L, "00-00-0000", "shipping address", "Texas", "USA", "9638",(1.51f))))
                                .contentType(MediaType.APPLICATION_JSON)
                                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", notNullValue()));
    }

    @Test
    @Order(19)
    public void putInvoice() throws Exception {
        mvc.perform(
                        MockMvcRequestBuilders.put
                                        ("/invoice/5")
.content(asJsonString(new Invoice((8L),5L, "00-00-0000", "email address", "Madrid", "Spain", "1234",(1.53f))))
                                .contentType(MediaType.APPLICATION_JSON)
                                .accept(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", notNullValue()))
                .andExpect(status().isOk());
    }

    @Test
    @Order(20)
    public void deleteInvoice() throws Exception {
        mvc.perform(MockMvcRequestBuilders.delete("/invoice/5"))
                .andExpect(status().isOk());
    }

}