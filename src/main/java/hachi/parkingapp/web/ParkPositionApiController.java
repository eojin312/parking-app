package hachi.parkingapp.web;

import hachi.parkingapp.domain.park.ParkPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/park")
public class ParkPositionApiController {

    @Autowired
    private ParkPositionService parkPositionService;

    @PostMapping("")
    public ParkPosition save(@RequestParam("lastPosition") String lastPosition) {
        ParkPosition parkPosition = parkPositionService.save(lastPosition);
        return parkPosition;
    }

    @GetMapping("")
    public String getLastPosition() {
        return parkPositionService.findById(1L).map(ParkPosition::getLastPosition).orElse("0");
    }
}
