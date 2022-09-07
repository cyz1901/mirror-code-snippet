package pages

import japgolly.scalajs.react.vdom.html_<^.*
import japgolly.scalajs.react.{Callback, ScalaFnComponent}
import typings.monacoEditorReact.components.{React => ReactMonacoEditor}
import typings.monacoEditorReact.mod.EditorProps

object Home {
  val home = ScalaFnComponent[Unit] { _ =>
    val props = EditorProps()
      .setHeight("100px")
      .setDefaultLanguage("scala")
      .setOnValidate(_ => Callback(println("hello")))
      .setOnChange((value, event) => Callback(println("world")))

    ReactMonacoEditor.withProps(props)
  }
}
