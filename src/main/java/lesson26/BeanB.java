package lesson26;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Lazy;

@Getter
@Setter
//@RequiredArgsConstructor
public class BeanB {

    private BeanA bean;

}
