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
    public ParkPosition save(@RequestParam("lastPosition") String lastPosition, @RequestParam(value = "no", defaultValue = "0") Long no) {
        ParkPosition parkPosition = parkPositionService.save(lastPosition, no);
        return parkPosition;
    }

    @GetMapping("")
    public String getLastPosition(@RequestParam(value = "no", defaultValue = "1") Long no) {
        return parkPositionService.findById(no).map(ParkPosition::getLastPosition).orElse("0");
    }
}
