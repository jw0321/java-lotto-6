package lotto.model; //패키지 변경은 가능

import java.util.List;

public class Lotto { //번호들이 범위 내에 있는지, 중복되지 않는지 검증
    private final List<Integer> numbers; //접근제어자 변경 불가능
                                         //필드(인스턴스 변수) 추가 불가능
    public Lotto(List<Integer> numbers) { //생성자에 추가 기능 구현 가능
        validate(numbers);
        hasDuplicate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) { //기본적으로 6자인 부분만 확인
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    // TODO: 추가 기능 구현
    private void hasDuplicate(List<Integer> numbers) {
        if(numbers.size() != numbers.stream().distinct().count()) {
            throw new IllegalArgumentException();
        }
    }

}