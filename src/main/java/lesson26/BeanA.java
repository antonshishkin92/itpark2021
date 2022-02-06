package lesson26;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@RequiredArgsConstructor
public class BeanA {

    private BeanB bean;

    public void Setbean(){
        this.bean=bean;
    }
}
