package a17_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data


public class GenericEx<T> { // T는 타입형태(자료형)
	
	private T data;
	
}
