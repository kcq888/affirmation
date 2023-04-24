package org.gdglawrence.data

import org.gdglawrence.model.Affirmation
import org.gdglawrence.platform.Res

/**
 * [Datasource] generates a list of [Affirmation]
 */
class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(Res.string.affirmation1, Res.drawable.image1),
            Affirmation(Res.string.affirmation2, Res.drawable.image2),
            Affirmation(Res.string.affirmation3, Res.drawable.image3),
            Affirmation(Res.string.affirmation4, Res.drawable.image4),
            Affirmation(Res.string.affirmation5, Res.drawable.image5),
            Affirmation(Res.string.affirmation6, Res.drawable.image6),
            Affirmation(Res.string.affirmation7, Res.drawable.image7),
            Affirmation(Res.string.affirmation8, Res.drawable.image8),
            Affirmation(Res.string.affirmation9, Res.drawable.image9),
            Affirmation(Res.string.affirmation10, Res.drawable.image10))
    }
}