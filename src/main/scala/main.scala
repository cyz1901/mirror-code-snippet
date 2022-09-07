package per.cyz.snippet

import japgolly.scalajs.react.vdom.html_<^.*
import japgolly.scalajs.react.ScalaFnComponent
import org.scalajs.dom
import components.SideNavigationBar

import pages.HomePage
import routers.Router as AppRouter
import japgolly.scalajs.react.extra.router.BaseUrl
import japgolly.scalajs.react.extra.router.Router

@main
def main: Unit =
  // HomePage
  //   .home()
  //   .renderIntoDOM(
  //     dom.document.getElementById("container")
  //   )
  val router = Router(baseUrl = BaseUrl.fromWindowOrigin / "index.html", cfg = AppRouter.routerConfig)
  router().renderIntoDOM(dom.document.getElementById("container"))