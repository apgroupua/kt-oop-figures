package mate.academy.model.impl

import mate.academy.model.Color
import mate.academy.model.AreaCalculator
import mate.academy.model.Figure

class Circle(color: Color, private val radius: Double) : Figure(color), AreaCalculator {
    override fun getArea(): Double = (radius * radius) * Math.PI

    override fun draw() = println("Figure: circle," +
            "area: ${getArea()} sq. units," +
            "radius: $radius units," +
            "color: $color")
}
