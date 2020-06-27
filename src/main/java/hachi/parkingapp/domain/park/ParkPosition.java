package hachi.parkingapp.domain.park;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * 주차 위치 entity
 */
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

    // 사용하는 유저의 핸드폰 구별
    @Column
    private String userAgent;

    @Builder
    public ParkPosition(Long no, String lastPosition, LocalDateTime updateDate, String userAgent) {
        this.no = no;
        this.lastPosition = lastPosition;
        this.updateDate = updateDate;
        this.userAgent = userAgent;
    }
}
