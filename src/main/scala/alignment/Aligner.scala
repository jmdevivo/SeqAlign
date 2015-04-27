package alignment

import org.biojava.nbio.alignment.template.SubstitutionMatrix
import org.biojava.nbio.alignment.{NeedlemanWunsch, SimpleGapPenalty, SmithWaterman, SubstitutionMatrixHelper}
import org.biojava.nbio.core.sequence.DNASequence
import org.biojava.nbio.core.sequence.compound.NucleotideCompound
/**
 * Created by jmdevivo on 4/24/15.
 */
object Aligner {
  val matrix: SubstitutionMatrix[NucleotideCompound] = SubstitutionMatrixHelper.getNuc4_4

  def computeNeedleManWunsch(seq1: DNASequence, seq2: DNASequence) = {
    val nwAligner: NeedlemanWunsch[DNASequence, NucleotideCompound] =
      new NeedlemanWunsch[DNASequence, NucleotideCompound](
        seq1,
        seq2,
        new SimpleGapPenalty(2, 1),
        matrix)
    (nwAligner.getPair, nwAligner.getScore, nwAligner.getComputationTime)
  }

  def computeSmithWaterman(seq1: DNASequence, seq2: DNASequence) = {
    val swAligner: SmithWaterman[DNASequence, NucleotideCompound] =
      new SmithWaterman[DNASequence, NucleotideCompound](
        seq1,
        seq2,
        new SimpleGapPenalty(2, 1),
        matrix)
    (swAligner.getPair, swAligner.getScore, swAligner.getComputationTime)
  }
}
