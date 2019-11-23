package org.subum.domain;

import lombok.Data;

@Data
public class DataVO {

	private int product_seq, quality, free_sulfur_dioxide, total_sulfur_dioxide;
	private float fixed_acidity, volatile_acidity, citric_acid, residual_sugar, chlorides, density;
	private float pH, sulphates, alcohol;


}
