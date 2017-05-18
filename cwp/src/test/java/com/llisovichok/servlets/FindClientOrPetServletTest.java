package com.llisovichok.servlets;

import com.llisovichok.lessons.clinic.Pet;
import com.llisovichok.models.User;
import com.llisovichok.storages.JdbcStorage;
import org.junit.Test;
import org.mockito.Mockito;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.junit.Assert.*;

/**
 * Created by homeuser on 16.05.2017.
 */
public class FindClientOrPetServletTest extends Mockito {

    JdbcStorage JDBC_STORAGE = JdbcStorage.getINSTANCE();

    @Test
    public void doPost() throws Exception {

        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);

        int id = JDBC_STORAGE.add(new User("Test","test", "test", 00001, new Pet("test", "test", 2)));

        try{
            when(req.getParameter("input")).thenReturn("Test");
            when(req.getParameter("first_name")).thenReturn("first_name");
            when(req.getParameter("last_name")).thenReturn("last_name");
            when(req.getParameter("pet_name")).thenReturn(null);

            new FindClientOrPetServlet().doPost(req,resp);
        } finally{
            JDBC_STORAGE.removeUser(id);
        }
    }
}