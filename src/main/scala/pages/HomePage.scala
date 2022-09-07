package pages

import routers.Router.AppPage
import japgolly.scalajs.react.vdom.html_<^.*
import japgolly.scalajs.react.{Callback, ScalaFnComponent}
import japgolly.scalajs.react.extra.router.RouterCtl
import typings.monacoEditorReact.components.{React => ReactMonacoEditor}
import typings.monacoEditorReact.mod.EditorProps

object HomePage {

  case class Props(ctrl: RouterCtl[AppPage])

  val home = ScalaFnComponent[Props] { _ =>
    val props = EditorProps()
      .setHeight("100%")
      .setDefaultLanguage("scala")
      .setOnValidate(_ => Callback(println("hello")))
      .setTheme("vs-dark")
      .setOnChange((value, event) => Callback(println("world")))

    <.div(
      ^.className := "drawer drawer-mobile",
      <.input(
        ^.id := "my-drawer",
        ^.`type` := "checkbox",
        ^.className := "drawer-toggle"
      ),
      <.div(
        ^.className := "drawer-content",
        ReactMonacoEditor.withProps(props)
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

  def apply(ctrl: RouterCtl[AppPage]) = home(Props(ctrl))
}
