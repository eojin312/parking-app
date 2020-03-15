package hachi.parkingapp.web;

import hachi.parkingapp.domain.park.ParkPosition;
import hachi.parkingapp.domain.park.ParkPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ParkPositionService {

    @Autowired
    private ParkPositionRepository parkPositionRepository;

    public ParkPosition save(String lastPosition) {

        ParkPosition parkPosition = ParkPosition.builder()
                .lastPosition(lastPosition)
                .updateDate(LocalDateTime.now())
                .no(1L)
                .build();

        parkPositionRepository.save(parkPosition);

        return parkPosition;
    }

    public ParkPosition findById(Long no) {
        return parkPositionRepository.findById(no).orElse(null);
    }
}
