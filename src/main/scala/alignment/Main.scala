package alignment


import org.apache.ignite.cache.{CachePeekMode, CacheMode}
import org.apache.ignite.cluster.ClusterGroup
import org.apache.ignite.configuration.CacheConfiguration
import org.apache.ignite.lang.IgniteRunnable
import org.apache.ignite.scalar.scalar
import org.apache.ignite.scalar.scalar._
import org.apache.ignite._
import scala.io.Source


/**
 * Write a program that creates 11 thousand jobs. Each job aligns two sequences(this is a shitty way to do it)
 * (100 jobs 100 sequences each is better). Create an array of runnables where each runnable is one of these jobs
 * Take sequence you read in from file align it with every one of the 11 thousond sequences. Check testing programs
 * inspiration on referencing sequences by key
 * Each program must take a sequence and a name, look up a sequence in the cache based on that name. Do an alignment
 * on the two of them and return interger result. Figure out how to do the reduce stuff
 * Created by jmdevivo on 4/24/15.
 */
object Main extends App{
  Ignition.setClientMode(true)

  scalar {
    
  }

}
