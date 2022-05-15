package com.graphqlmicronaut

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.graphqlmicronaut")
		.start()
}

