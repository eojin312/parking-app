package hachi.parkingapp.web;

import hachi.parkingapp.domain.park.ParkPosition;
import hachi.parkingapp.domain.park.ParkPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class ParkPositionService {

    @Autowired
    private ParkPositionRepository parkPositionRepository;

    public ParkPosition save(String lastPosition, Long no) {

        ParkPosition parkPosition = ParkPosition.builder()
                .lastPosition(lastPosition)
                .updateDate(LocalDateTime.now())
                .no(no)
                .build();

        parkPositionRepository.save(parkPosition);

        return parkPosition;
    }

    public Optional<ParkPosition> findById(Long no) {

        ParkPosition defaultParkPosition = ParkPosition.builder()
                .lastPosition("0")
                .updateDate(LocalDateTime.now())
                .no(no)
                .build();


        return parkPositionRepository.findById(no);
    }
}
