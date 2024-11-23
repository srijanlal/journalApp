package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserRepository userRepository;

    @BeforeEach
    @Disabled
    void setUp(){

    }

    @ParameterizedTest
    @ValueSource(strings = {
            "ram",
            "rahul",
            "vipul",
            "rohit"
    })
    @Disabled
    public void testFindByUserName(String name){
        User user = userRepository.findByUserName(name);
        assertTrue(!user.getJournalEntries().isEmpty());
    }

    @Disabled
    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "2,3,5",
            "2,5,2"
    })
    public void test(int a, int b, int expected){
        assertEquals(expected, a+b);
    }
}
