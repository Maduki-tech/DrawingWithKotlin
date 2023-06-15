import org.openrndr.application
import org.openrndr.color.ColorRGBa
import kotlin.math.sin

fun main () = application {
    configure {
        width = 640
        height = 480
    }
    program {
        extend {
            drawer.clear(ColorRGBa.PINK)

            // -- draw circle with white fill and black stroke
            drawer.fill = ColorRGBa.WHITE
            drawer.stroke = ColorRGBa.BLACK
            drawer.strokeWeight = 1.0
            drawer.rectangle(width / 6.0, height / 2.0, width / 8.0)

            // -- draw rectangle without fill, but with black stroke
            drawer.fill = null
            drawer.stroke = ColorRGBa.BLACK
            drawer.strokeWeight = 1.0
            drawer.rectangle(width / 6.0 + width / 3.0, height / 2.0, width / 8.0 * sin(seconds))

            // -- draw rectangle with white fill, but without stroke
            drawer.fill = ColorRGBa.WHITE
            drawer.stroke = null
            drawer.strokeWeight = 1.0
            drawer.rectangle(width / 6.0 + 2 * width / 3.0, height / 2.0, width / 8.0)

            drawer.fill = ColorRGBa.CYAN
            drawer.rectangle(mouse.position, 10.0)
        }
    }
}