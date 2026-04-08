class Singleton private constructor() {

    private var value: String? = null

    companion object {
        private var uniqueInstance: Singleton? = null

        fun getInstance(): Singleton {
            if(uniqueInstance == null) uniqueInstance = Singleton()

            return uniqueInstance!!
        }
    }

    fun getValue(): String? {
        return value
    }

    fun setValue(value: String) {
        this.value = value
    }
}
