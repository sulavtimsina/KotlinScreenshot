import java.awt.Rectangle
import java.awt.Robot
import java.io.File
import javax.imageio.ImageIO

fun main(args: Array<String>) {

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    // Set the screen capture area
    val captureArea = Rectangle(100, 100, 400, 400)

    // Create a robot object to capture the screen
    val robot = Robot()

    // Capture the screen as an image
    val screenCapture = robot.createScreenCapture(captureArea)

    // Save the image to a file
    val outputfile = File("screenshot1.png")
    ImageIO.write(screenCapture, "png", outputfile)
}

