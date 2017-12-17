package tv.codely.scala_intro_examples.lesson_07_generics

import tv.codely.scala_intro_examples.lesson_05_ifs_for.Ingredients.{Egg, FriedEgg}

import scala.concurrent.duration._
import scala.concurrent.{ExecutionContext, Future}

class EggFryer(implicit ec: ExecutionContext) extends GenericFryer[Egg, FriedEgg] {
  private val minFryTime = 6.second

  override def fry(egg: Egg) = Future {
    Thread.sleep(minFryTime.toMillis)

    FriedEgg(egg)
  }

}
