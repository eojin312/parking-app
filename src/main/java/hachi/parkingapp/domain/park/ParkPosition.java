package hachi.parkingapp.domain.park;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
public class ParkPosition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @Column(nullable = false)
    private String lastPosition;

    @Column(nullable = false)
    private LocalDateTime updateDate;


    @Builder
    public ParkPosition(Long no, String lastPosition, LocalDateTime updateDate) {
        this.no = no;
        this.lastPosition = lastPosition;
        this.updateDate = updateDate;
    }
}
