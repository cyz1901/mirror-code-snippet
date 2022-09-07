package per.cyz.snippet
package components
import japgolly.scalajs.react.ScalaFnComponent
import japgolly.scalajs.react.vdom.html_<^.*

object SideNavigationBar {

  val sideNavigationBar = ScalaFnComponent[Unit] { _ =>
    <.div(
      ^.className := "drawer drawer-mobile",
      <.input(
        ^.id := "my-drawer",
        ^.`type` := "checkbox",
        ^.className := "drawer-toggle"
      ),
      <.div(
        ^.className := "drawer-content"
      ),
      <.div(
        ^.className := "drawer-side",
        <.label(^.`for` := "my-drawer", ^.className := "drawer-overlay"),
        <.ul(
          ^.className := "menu p-0 overflow-y-auto w-12 bg-base-100 text-base-content",
          <.li(
            <.a("C")
          )
        )
      )
    )
  }
}
