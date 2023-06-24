package controllers

import com.kristileka.engine.Test

import javax.inject._
import play.api.mvc._

@Singleton
class IndexController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def index(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok(Test.test())
  }
}
