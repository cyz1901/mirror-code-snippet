package components
import japgolly.scalajs.react.ScalaFnComponent
import japgolly.scalajs.react.vdom.html_<^.*

object FileColumnComponent {

  case class Props()

  val fileColumn = ScalaFnComponent[Unit] { _ =>
    <.div(^.className := "h-full w-20 bg-slate-600")
  }
}
