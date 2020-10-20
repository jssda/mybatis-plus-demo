package pers.jssd.mybatisplusdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author jssd
 */
@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Students {

    private long id;

    private String name;

    private long grade;

//    private long clazz;

}
