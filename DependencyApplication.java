package com.injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext Context = SpringApplication.run(DependencyApplication.class, args);
		MusicSheet m1 = Context.getBean(MusicSheet.class);
		m1.setMkey("A#");
		m1.setMname("Arrival of The Queen");
		m1.setMtimesig(4.4);
		m1.show();
		Part p1 = Context.getBean(Part.class);
        p1.setName("Soprano");
        p1.setSingers(8);
        Part.isBass=false;
        p1.show();
        Instruments i1 = Context.getBean(Instruments.class);
        i1.setMatOfInstr("Brass trumpet");
        i1.setPriceOfInstr(1000);
        i1.setTypeOfInstr("Wind");
        i1.Orchestra();
        i1.show();
	}

}
