package racingcar

import camp.nextstep.edu.missionutils.Console
import camp.nextstep.edu.missionutils.Randoms
import racingcar.domain.Cars


fun main() {
    println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
    val carNames = Console.readLine().split(",")
    val cars = Cars.create(carNames)
    println(cars.getCars().asSequence().map { it.name }.joinToString(","))

    println("시도할 회수는 몇회인가요?")
    val tryCount = Console.readLine().toInt()

    println("실행 결과")
    repeat(IntRange(1, tryCount).count()) {
        cars.move { if (Randoms.pickNumberInRange(0, 9) >= 4) 1 else 0 }
        println(cars)
        println()
    }

    println("최종 우승자 : ${cars.findWinnerCars().joinToString(", ") { it.name }}")
}
