package com.example.formasi2.ui.beasiswa

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.formasi2.R

class BeasiswaFragment : Fragment() {

    private lateinit var BeasiswaDataViewModel: BeasiswaViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.beasiswa_fragment, container, false)
        val testData = createBeasiswaData()
        root.findViewById<RecyclerView>(R.id.beasiswarv).layoutManager = LinearLayoutManager(context)
        root.findViewById<RecyclerView>(R.id.beasiswarv).setHasFixedSize(true)
        root.findViewById<RecyclerView>(R.id.beasiswarv).adapter = BeasiswaAdapter(testData, {
            BeasiswaItem: BeasiswaData -> beasiswaItemClicked(BeasiswaItem)})
        return root
    }

    private fun beasiswaItemClicked(BeasiswaData: BeasiswaData) {
        val showDetailActivity = Intent(context, BeasiswaDetailActivity::class.java)
        showDetailActivity.putExtra(Intent.EXTRA_SPLIT_NAME, BeasiswaData.BeasiswaPhoto.toString())
        showDetailActivity.putExtra(Intent.EXTRA_COMPONENT_NAME, BeasiswaData.BeasiswaNama)
        showDetailActivity.putExtra(Intent.EXTRA_INSTALLER_PACKAGE_NAME, BeasiswaData.BeasiswaDate)
        showDetailActivity.putExtra(Intent.EXTRA_EXCLUDE_COMPONENTS, BeasiswaData.BeasiswaDeskripsi)
        showDetailActivity.putExtra(Intent.EXTRA_REFERRER_NAME, BeasiswaData.BeasiswaLink)
        startActivity(showDetailActivity)
    }

    private fun createBeasiswaData() : List<BeasiswaData> {
        val partList = ArrayList<BeasiswaData>()
        partList.add(BeasiswaData(R.drawable.bea2,
            "Beasiswa Kampung Inggris",
            "Batch mulai 4 Januari 2021 - 15 Maret 2021",
            "Hallo English Learners !! \n" +
                    "Ada kabar baik buat kalian yang mau kursus bahasa inggris, \n" +
                    "memperingati new normal dan tahun baru 2021 ASTERDAM KAMPUNG INGGRIS \n" +
                    "membuka program beasiswa 50% ya guysss, disini kalian akan diajarin dari dasar \n" +
                    "sampai bisa ngomong cas cis cus , dijamin kalian gak bakalan nyesel guyss!",
            "https://www.asterdam.id"
        ))
        partList.add(BeasiswaData(R.drawable.bea10,
        "Tech MBA Scholarship Competition oleh Tokopedia & IE University",
        "Deadline 10 Januari 2021",
        "Bagi kamu ahli teknologi yang ingin menunjukkan kemampuan pengetahuan kamu, yuk ikuti Kompetisi Tech MBA Scholarship berikut ini. Program Tech MBA Scholarship Competition diselenggarakan oleh Tokopedia bekerjasama dengan IE University yang terletak di Spanyol. Peserta yang mendaftar akan berkesempatan untuk memenangkan beasiswa studi teknologi selama satu tahun di IE University, Madrid, Spanyol dan kesempatan bergabung dengan Tokopedia Academy.",
        "https://indbeasiswa.com/2020/12/tech-mba-scholarship.html"
        ))
        partList.add(BeasiswaData(R.drawable.bea6,
                "Stipendium Hungaricum (S1/S2/S3)",
                "Deadline 15 Januari 2021",
                "Stipendium Hungaricum, being the most prestigious higher education scholarship programme of the Hungarian Government, offers a wide range of courses for international students of excellent academic track record. The scholarship aims to support the internationalization of the Hungarian higher education and its constant development, to strengthen the international relations of the academic and research community, and to promote the good reputation and competitiveness of the Hungarian higher education throughout the world.",
                "https://stipendiumhungaricum.hu/"
        ))
        partList.add(BeasiswaData(R.drawable.bea8,
                "Holland Scholarship",
                "Deadline 1 Februari 2021 / 1 Mei 2021",
                "PERSYARATAN:\n" +
                        "\n" +
                        "1. Bukan merupakan warganegara Area Ekonomi Eropa (peserta dari Indonesia dapat mendaftar).\n" +
                        "2. Mendaftar pada program full-time Bachelor atau Master di salah satu institusi pendidikan tinggi Belanda yang berpartisipasi.\n" +
                        "3. Memenuhi persyaratan (akademik dan bahasa) yang diminta oleh institusi tujuan (lihat di website universitas yang dituju).\n" +
                        "4. Sebelumnya tidak pernah menempuh pendidikan di Belanda.",
                "https://indbeasiswa.com/2020/10/beasiswa-di-belanda-holland.html"
        ))
        partList.add(BeasiswaData(R.drawable.bea5,
                "Fulbright Scholarship (S2/S3)",
                "Deadline 15 Februari 2021",
                "The applicant should:\n" +
                        "• Be an Indonesian citizen and not a permanent resident or citizen of the US, or be currently living in the US\n" +
                        "• Possess leadership qualities and show experience in community service\n" +
                        "• Have preparation in, and a demonstrated commitment to their chosen field of study\n" +
                        "• Be proficient in English\n" +
                        "• Have an outstanding academic record\n" +
                        "• Demonstrate that they can realistically accomplish full-time graduate study or conduct research in the US\n" +
                        "• Demonstrate a strong commitment to return to Indonesia upon completion of the Fulbright scholarship program\n" +
                        "• Be willing to work for at least five years before retirement upon the completion of the scholarship program",
                "https://www.aminef.or.id/grants-for-indonesians/fulbright-programs/scholarship/"
        ))
        partList.add(BeasiswaData(R.drawable.bea9,
                "Beasiswa STIE Perbanas Surabaya",
                "Deadline 22 Februari 2021",
                "PERSYARATAN UMUM BEASISWA STIE PERBANAS:\n" +
                        "\n" +
                        "• Untuk pendaftar Beasiswa Penuh: Merupakan siswa kelas XII SMA/SMK/MA/Sederajat pada Tahun Ajaran 2020/2021 atau akan lulus tahun 2021.\n" +
                        "• Untuk pendaftar Beasiswa KIP Kuliah: Merupakan siswa kelas XII SMA/SMK/MA/Sederajat pada Tahun Ajaran 2019/2020 dan 2020/2021.\n" +
                        "• Nilai rata-rata raport sejak kelas X sampai XI untuk Matematika dan Bahasa Inggris masing-masing minimal 80.\n" +
                        "• Lulus seleksi administrasi, tes online, wawancara serta tes psikologi.",
                "https://indbeasiswa.com/2020/11/beasiswa-stie-perbanas-surabaya.html"
        ))
        partList.add(BeasiswaData(R.drawable.bea7,
        "Singapore Management University (SMU)",
        "Deadline 19 Maret 2021",
        "Persyaratan Umum:\n"+
                "• Lulusan SMA/sederajat dengan prestasi akademik yang bagus\n"+
                "• Siswa kelas 12 yang akan lulus tahun 2021\n"+
                "• Memenuhi persyaratan akademis masing-masing program studi yang dipilih (termasuk penguasaan bahasa Inggris dengan sertifikat TOEFL, IELTS, atau tes lainnya)\n"+
                "• Memiliki jiwa kepemimpinan dan kemampuan berkomunikasi dengan baik\n"+
                "• Aktif dalam kegiatan ko-kulikuler",
        "https://www.beasiswakita.com/2020/10/asean-smu-s1-2020.html"
        ))
        return partList
    }
}