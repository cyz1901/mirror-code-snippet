package per.cyz.snippet

import japgolly.scalajs.react.vdom.html_<^.*
import japgolly.scalajs.react.ScalaFnComponent
import org.scalajs.dom
import components.SideNavigationBar

import pages.Home

@main
def main: Unit =
  Home
    .home()
    .renderIntoDOM(
      dom.document.getElementById("container")
    )
