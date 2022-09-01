package per.cyz.snippet
package components
import japgolly.scalajs.react.ScalaFnComponent
import japgolly.scalajs.react.vdom.html_<^.*

object SideNavigationBar {

  val sideNavigationBar = ScalaFnComponent[Unit] { _ =>
    <.div(
      ^.className := "drawer",
      <.input(
        ^.id := "my-drawer",
        ^.`type` := "checkbox",
        ^.className := "drawer-toggle"
      ),
      <.div(
        ^.className := "drawer-content",
        <.label(
          ^.`for` := "my-drawer",
          ^.className := "btn btn-primary drawer-button",
          "Open drawer"
        )
      ),
      <.div(
        ^.className := "drawer-side",
        <.label(^.`for` := "my-drawer", ^.className := "drawer-overlay"),
        <.ul(
          ^.className := "menu p-4 overflow-y-auto w-80 bg-base-100 text-base-content",
          <.li(
            <.a("Sidebar Item 1")
          ),
          <.li(
            <.a("Sidebar Item 2")
          )
        )
      )
    )
  }
}
