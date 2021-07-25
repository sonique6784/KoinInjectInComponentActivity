package fr.sonique.kointest.di.toinject


interface DummyInject {
    fun hello(world: String)
}

class DummyInjectImpl: DummyInject {
    override fun hello(world: String) {
        print("$world")
    }
}