package hachi.parkingapp.domain.park;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParkPositionRepositoryTest {

    @Autowired
    private ParkPositionRepository parkPositionRepository;

    @Test
    public void save테스트() {
        ParkPosition parkPosition = ParkPosition.builder()
                .lastPosition("2")
                .updateDate(LocalDateTime.now())
                .no(1L)
                .build();


        parkPositionRepository.save(parkPosition);

        Assert.assertTrue(parkPosition.getNo() > 0);
    }

    @Test
    public void 조회테스트() {
        String lastPosition = parkPositionRepository.findById(1L).map(ParkPosition::getLastPosition).orElse("0");
        Assert.assertTrue(lastPosition.length() > 0);
    }

}