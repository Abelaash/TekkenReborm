package com.cpan252.tekkenreborn;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cpan252.tekkenreborn.model.Fighter;
import com.cpan252.tekkenreborn.model.Fighter.Anime;
import com.cpan252.tekkenreborn.repository.FighterRepository;

@SpringBootApplication
public class TekkenrebornApplication {


	public static void main(String[] args) {
		SpringApplication.run(TekkenrebornApplication.class, args);
	}

	@Bean
	public CommandLineRunner dataLoader(FighterRepository repository) {
		return args -> {
			repository.save(Fighter.builder()
					.name("Heihachi Mishima")
					.animeFrom(Anime.TEKKEN)
					.damagePerHit(89)
					.health(2000)
					.resistance(new BigDecimal(0.5))
					.url("https://static.wikia.nocookie.net/namco/images/b/b2/Heihachittt2.jpg/revision/latest/scale-to-width-down/1000?cb=20140515015505").build());


			repository.save(Fighter.builder()
					.name("Kazuya Mishima")
					.animeFrom(Anime.TEKKEN)
					.damagePerHit(86)
					.health(2100)
					.resistance(new BigDecimal(0.5))
					.url("https://static.wikia.nocookie.net/namco/images/a/ab/Kazuya_Mishima.jpg/revision/latest?cb=20120726072539").build());

			repository.save(Fighter.builder()
					.name("Jin Kazama")
					.animeFrom(Anime.TEKKEN)
					.damagePerHit(90)
					.health(2200)
					.resistance(new BigDecimal(0.5))
					.url("https://static.wikia.nocookie.net/namco/images/9/9c/PxZJinKazama.jpg/revision/latest?cb=20121120020042").build());

			repository.save(Fighter.builder()
					.name("Steve Fox")
					.animeFrom(Anime.TEKKEN)
					.damagePerHit(80)
					.health(25000)
					.resistance(new BigDecimal(0.5))
					.url("https://static.wikia.nocookie.net/p__/images/b/bb/Steve_Fox_%28Tekken_8%29.png/revision/latest?cb=20230823025107&path-prefix=protagonist").build());
			repository.save(Fighter.builder()
					.name("Hwoarang")
					.animeFrom(Anime.TEKKEN)
					.damagePerHit(89)
					.health(2000)
					.resistance(new BigDecimal(0.5))
					.url("https://static.wikia.nocookie.net/tekken/images/1/19/Hwoarang_TK8_render.jpg/revision/latest?cb=20230516120648&path-prefix=en").build());


			repository.save(Fighter.builder()
					.name("Panda")
					.animeFrom(Anime.TEKKEN)
					.damagePerHit(86)
					.health(2100)
					.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
					.name("Eddy Gordo")
					.animeFrom(Anime.TEKKEN)
					.damagePerHit(90)
					.health(2200)
					.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
					.name("Steve Fox")
					.animeFrom(Anime.TEKKEN)
					.damagePerHit(80)
					.health(25000)
					.resistance(new BigDecimal(0.5)).build());
			repository.save(Fighter.builder()
					.name("Law")
					.animeFrom(Anime.TEKKEN)
					.damagePerHit(89)
					.health(2000)
					.resistance(new BigDecimal(0.5))
					.url("https://upload.wikimedia.org/wikipedia/en/2/29/Marshall_Law_%28T8%29.png").build());

			repository.save(Fighter.builder()
					.name("Lei Wulong")
					.animeFrom(Anime.TEKKEN)
					.damagePerHit(86)
					.health(2100)
					.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
					.name("Anna")
					.animeFrom(Anime.TEKKEN)
					.damagePerHit(90)
					.health(2200)
					.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
					.name("Xiaoyu")
					.animeFrom(Anime.TEKKEN)
					.damagePerHit(80)
					.health(25000)
					.resistance(new BigDecimal(0.5)).build());
			repository.save(Fighter.builder()
					.name("Brian Fury")
					.animeFrom(Anime.TEKKEN)
					.damagePerHit(89)
					.health(2000)
					.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
					.name("Kuma")
					.animeFrom(Anime.TEKKEN)
					.damagePerHit(86)
					.health(2100)
					.resistance(new BigDecimal(0.5))
					.url("https://media.eventhubs.com/images/2023/08/11_tekbnr.webp").build());

			repository.save(Fighter.builder()
					.name("Paul Phoenix")
					.animeFrom(Anime.TEKKEN)
					.damagePerHit(90)
					.health(2200)
					.resistance(new BigDecimal(0.5))
					.url("https://media.eventhubs.com/images/2023/08/11_tekbnr.webp").build());

			repository.save(Fighter.builder()
					.name("King")
					.animeFrom(Anime.TEKKEN)
					.damagePerHit(80)
					.health(25000)
					.resistance(new BigDecimal(0.5)).build());
			repository.save(Fighter.builder()
					.name("Bruce Irvin")
					.animeFrom(Anime.TEKKEN)
					.damagePerHit(89)
					.health(2000)
					.resistance(new BigDecimal(0.5))
					.url("https://media.eventhubs.com/images/2023/08/11_tekbnr.webp").build());

			repository.save(Fighter.builder()
					.name("Dragunov")
					.animeFrom(Anime.TEKKEN)
					.damagePerHit(86)
					.health(2100)
					.resistance(new BigDecimal(0.5))
					.url("https://media.eventhubs.com/images/2023/08/11_tekbnr.webp").build());

			repository.save(Fighter.builder()
					.name("Lars Alexandersson")
					.animeFrom(Anime.TEKKEN)
					.damagePerHit(90)
					.health(2200)
					.resistance(new BigDecimal(0.5))
					.url("https://media.eventhubs.com/images/2023/08/11_tekbnr.webp").build());

			repository.save(Fighter.builder()
					.name("Devil Jin")
					.animeFrom(Anime.TEKKEN)
					.damagePerHit(80)
					.health(25000)
					.resistance(new BigDecimal(0.5))
					.url("https://media.eventhubs.com/images/2023/08/11_tekbnr.webp").build());
			repository.save(Fighter.builder()
					.name("Avi")
					.animeFrom(Anime.TEKKEN)
					.damagePerHit(80)
					.health(25000)
					.resistance(new BigDecimal(0.5))
					.url("https://media.eventhubs.com/images/2023/08/11_tekbnr.webp").build());
		};
	}

}
