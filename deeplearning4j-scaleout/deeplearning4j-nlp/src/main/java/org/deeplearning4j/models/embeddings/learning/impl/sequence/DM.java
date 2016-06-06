package org.deeplearning4j.models.embeddings.learning.impl.sequence;

import lombok.NonNull;
import org.deeplearning4j.models.embeddings.WeightLookupTable;
import org.deeplearning4j.models.embeddings.learning.ElementsLearningAlgorithm;
import org.deeplearning4j.models.embeddings.learning.SequenceLearningAlgorithm;
import org.deeplearning4j.models.embeddings.loader.VectorsConfiguration;
import org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator;
import org.deeplearning4j.models.sequencevectors.sequence.Sequence;
import org.deeplearning4j.models.sequencevectors.sequence.SequenceElement;
import org.deeplearning4j.models.word2vec.wordstore.VocabCache;

import java.util.concurrent.atomic.AtomicLong;

/**
 * DM implementation for DeepLearning4j
 *
 * @author raver119@gmail.com
 */
public class DM<T extends SequenceElement> implements SequenceLearningAlgorithm<T> {
    private VocabCache<T> vocabCache;
    private WeightLookupTable<T> lookupTable;
    private VectorsConfiguration configuration;

    @Override
    public String getCodeName() {
        return "DistributedMemory";
    }

    @Override
    public void configure(@NonNull VocabCache<T> vocabCache,@NonNull WeightLookupTable<T> lookupTable,@NonNull VectorsConfiguration configuration) {
        this.vocabCache = vocabCache;
        this.lookupTable = lookupTable;
        this.configuration = configuration;
    }

    @Override
    public void pretrain(SequenceIterator<T> iterator) {

    }

    @Override
    public void learnSequence(Sequence<T> sequence, AtomicLong nextRandom, double learningRate) {

    }

    @Override
    public boolean isEarlyTerminationHit() {
        return false;
    }
}
