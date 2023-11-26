package racingcar.domain

data class Cars(private val cars: MutableMap<Car, Int>) {
    companion object {
        private const val CAR_NAME_MAX_LENGTH = 5
        private const val INIT_POSITION = 0

        fun create(names: List<String>): Cars {
            validateName(names)

            return Cars(
                names.asSequence()
                    .map { Car(it) }
                    .map { Pair(it, INIT_POSITION) }
                    .toMap()
                    .toMutableMap()
            )
        }

        private fun validateName(names: List<String>) {
            if (names.any { it.length > CAR_NAME_MAX_LENGTH }) {
                throw IllegalArgumentException("자동차 이름은 ${CAR_NAME_MAX_LENGTH}자 이하만 가능합니다.")
            }
        }

    }

    fun move(moveStrategy: () -> Int) {
        cars.forEach { (car, position) ->
            cars[car] = position + moveStrategy()
        }
    }

    fun findWinnerCars() : List<Car> {
        val maxPosition = cars.maxByOrNull { it.value }?.value
        return cars.filter { it.value == maxPosition }.keys.toList()
    }

    fun getCars() : MutableSet<Car> = cars.keys

    override fun toString(): String {
        return cars.map { "${it.key.name} : ${"-".repeat(it.value)}" }.joinToString("\n")
    }
}
