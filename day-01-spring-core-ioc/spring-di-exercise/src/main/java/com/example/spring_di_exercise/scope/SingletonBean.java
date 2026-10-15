
package com.example.spring_di_exercise.scope;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    private final ObjectProvider<PrototypeBean> prototypeProvider;

    public SingletonBean(
            ObjectProvider<PrototypeBean> prototypeProvider) {
        this.prototypeProvider = prototypeProvider;
    }

    public void test() {
        PrototypeBean prototypeBean = prototypeProvider.getObject();

        System.out.println(
                "In test method Prototype Bean has Code: "
                        + prototypeBean.hashCode()
        );
    }
}
