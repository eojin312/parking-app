package hachi.parkingapp.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ParkPositionApiControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;


    @Test
    public void save() {

    }

    @Test
    public void GET마지막위치조회with_no파라미터() {
        String uri = "http://localhost:8080/park?no=1";
        ResponseEntity<String> responseEntity = testRestTemplate.exchange(uri, HttpMethod.GET, null, String.class);
        String responseBody = responseEntity.getBody();
        int lastPosition = Integer.parseInt(responseBody);
        assertTrue(lastPosition > 0);
    }

    @Test
    public void GET마지막위치조회without파라미터() {
        String uri = "http://localhost:8080/park";
        ResponseEntity<String> responseEntity = testRestTemplate.exchange(uri, HttpMethod.GET, null, String.class);
        String responseBody = responseEntity.getBody();
        int lastPosition = Integer.parseInt(responseBody);
        assertTrue(lastPosition > 0);
    }

    @Test
    public void GET마지막위치조회with_없는번호로요청왔을때() {
        String uri = "http://localhost:8080/park?no=100000";
        ResponseEntity<String> responseEntity = testRestTemplate.exchange(uri, HttpMethod.GET, null, String.class);
        String responseBody = responseEntity.getBody();
        int lastPosition = Integer.parseInt(responseBody);
        assertTrue(lastPosition == 0);
    }

    @Test(expected = NumberFormatException.class)
    public void GET마지막위치조회with_파라미터가숫자가아닌경우() {
        String uri = "http://localhost:8080/park?no=abde";
        ResponseEntity<String> responseEntity = testRestTemplate.exchange(uri, HttpMethod.GET, null, String.class);
        String responseBody = responseEntity.getBody();
        int lastPosition = Integer.parseInt(responseBody);
    }
}