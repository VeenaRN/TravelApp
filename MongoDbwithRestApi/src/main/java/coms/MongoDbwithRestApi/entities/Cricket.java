package coms.MongoDbwithRestApi.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cricket {
	
	private int crkno;
	private String crkname;
	private String gametype;
	private int runs;

}
