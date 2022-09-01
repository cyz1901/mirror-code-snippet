package per.cyz.snippet

import japgolly.scalajs.react.vdom.html_<^.*
import japgolly.scalajs.react.ScalaFnComponent
import org.scalajs.dom

import components.SideNavigationBar

@main
def main: Unit =
  SideNavigationBar
    .sideNavigationBar()
    .renderIntoDOM(
      dom.document.getElementById("container")
    )
