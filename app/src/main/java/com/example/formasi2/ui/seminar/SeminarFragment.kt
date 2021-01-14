package com.example.formasi2.ui.seminar

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.formasi2.R

class SeminarFragment : Fragment() {

    private lateinit var SeminarDataViewModel: SeminarViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.seminar_fragment, container, false)
        val testData = createSeminarData()
        root.findViewById<RecyclerView>(R.id.seminarrv).layoutManager = LinearLayoutManager(context)
        root.findViewById<RecyclerView>(R.id.seminarrv).setHasFixedSize(true)
        root.findViewById<RecyclerView>(R.id.seminarrv).adapter = SeminarAdapter(testData, {
            SeminarItem: SeminarData -> seminarItemClicked(SeminarItem)})
        return root
    }

    private fun seminarItemClicked(SeminarData: SeminarData) {
        val showDetailActivity = Intent(context, SeminarDetailActivity::class.java)
        showDetailActivity.putExtra(Intent.EXTRA_SPLIT_NAME, SeminarData.SeminarPhoto.toString())
        showDetailActivity.putExtra(Intent.EXTRA_COMPONENT_NAME, SeminarData.SeminarNama)
        showDetailActivity.putExtra(Intent.EXTRA_INSTALLER_PACKAGE_NAME, SeminarData.SeminarDate)
        showDetailActivity.putExtra(Intent.EXTRA_EXCLUDE_COMPONENTS, SeminarData.SeminarDeskripsi)
        showDetailActivity.putExtra(Intent.EXTRA_REFERRER_NAME, SeminarData.SeminarLink)
        startActivity(showDetailActivity)
    }

    private fun createSeminarData() : List<SeminarData> {
        val partList = ArrayList<SeminarData>()
        partList.add(SeminarData(R.drawable.seminar2,
                "Mendidik Anak Di Era Milenial dan Pandemi COVID-19",
                "Kamis, 7 Januari 2021",
                "Mari Ikuti Webinar Dharma Wanita Persatuan Universitas Negeri Padang dengan Tema\n" +
                        "\n" +
                        "\" Mendidik Anak Di Era Milenial dan Pandemi Covid-19\"\n" +
                        "\n" +
                        "Kamis 7 Januari 2021\n" +
                        "Pukul 13.30 s.d Selsai (WIB)",
                "https://docs.google.com/forms/d/e/1FAIpQLSfEwU7mO5Xg1PbPbpzFodBzU_-19KT_LVeu1bos8J61LSkjyw/viewform"
        ))
        partList.add(SeminarData(R.drawable.seminar3,
                "The Rise of Bank Banten (A Transformation Story)",
                "Jumat, 8 Januari 2021",
                "Webinar Bluechip, KRI dan Bank Banten\n" +
                        "\n" +
                        "“The Rise of Bank Banten\"\n" +
                        "\n" +
                        "on Friday, 8 January 2021\n" +
                        "at 15.30 WIB",
                "https://docs.google.com/forms/d/e/1FAIpQLSerxrY20TeT8zZvKCkKE7yOkYGtlNv1EAoqERYTpOoHRdtu1g/viewform"
        ))
        partList.add(SeminarData(R.drawable.seminar4,
                "Bangkit Kembali : Ekonomi Indonesia Pasca COVID-19",
                "Jumat, 8 Januari 2021",
                "Salam Demokrasi\n" +
                        "\n" +
                        "Pandemi Covid-19 telah membawa dampak signifikan terhadap perekonomian dunia, termasuk Indonesia. Sejumlah ekonom menilai, ekonomi Indonesia diprediksi bisa tumbuh positif dan akan memberikan proyeksi yang lebih optimistis pada 2021. Meski demikian, proyeksi ekonomi ke depan akan tergantung pada pemulihan aktivitas umum masyarakat yang sempat terhambat oleh pandemi.\n" +
                        "\n" +
                        "Lantas solusi apa yang paling tepat bagi Indonesia untuk mempercepat pemulihan ekonomi nasional mengingat tren pertumbuhan angka terkonfirmasi covid-19 justru semakin meningkat saat ini?.\n" +
                        "\n" +
                        "Yuk, dapatkan literasi ekonomi menyegarkan sekaligus sumbangkan gagasan terbaikmu dalam Kuliah Umum (Online) Citra Institute dengan tema \"Bangkit Kembali; Ekonomi Indonesia Pasca Covid-19\" dengan Nara Sumber Bapak Faisal Basri (Pakar Ekonomi; Pendiri INDEF)\n" +
                        "\n" +
                        "Hari/ Tanggal : Jumat, 08 Januari 2021\n" +
                        "Waktu : Pukul 19.00-21.30 WIB\n" +
                        "\n" +
                        "Meeting ID : 836 6066 6256\n" +
                        "Password : citraoke\n" +
                        "Join Zoom Meeting : http://bit.ly/JoinZoomKuliahUmumCitraInstitute\n" +
                        "\n" +
                        "Registrasi:\n" +
                        "http://bit.ly/DaftarKuliahUmumCitraInstitute\n" +
                        "\n" +
                        "Narahubung\n" +
                        "Nawari, WhatsApp +62 819-3279-2432",
                "http://bit.ly/DaftarKuliahUmumCitraInstitute"
        ))
        partList.add(SeminarData(R.drawable.seminar8,
                "WEMINAC FEST 2021\n"+
                "Upgrade Your Skills and Knowledge",
                "7-10 Januari 2021",
                "Hello, Youth!\n" +
                        "\n" +
                        "Women and Men Indonesia Center proudly presents, WEMINACFEST 2021: Upgrade Your Skills and Knowledge\n" +
                        "\n" +
                        "\uD83D\uDCC5 EVENT DATE\n" +
                        "7-10 January 2021\n" +
                        "• 3:00-5:00 PM (1st session)\n" +
                        "• 7:00-9:00 PM (2nd session)\n" +
                        "via Zoom Cloud Meeting & YouTube Live Streaming\n" +
                        "\n" +
                        "\uD83D\uDCDD WHAT WILL YOU GET?\n" +
                        "• Experiences\n" +
                        "• E-certificate\n" +
                        "• Minutes of meeting\n" +
                        "• Insight from amazing speakers\n" +
                        "\n" +
                        "\uD83D\uDCF2 HOW TO APPLY?\n" +
                        "• Follow weminac on Instagram, Twitter, and subscribe our YouTube channel\n" +
                        "• Share this poster to your Instastories and tag us\n" +
                        "• Mention 3 of your friends or more in this post\n" +
                        "\n" +
                        "• Register yourself on\n" +
                        "bit.ly/WeminacFest\n" +
                        "• Create your best photo with our twibbon\n" +
                        "http://bit.ly/twibbonweminacfest",
                "http://bit.ly/WeminacFest"
        ))
        partList.add(SeminarData(R.drawable.seminar1,
                "Membangun Kewirausahaan Melalui Public Speaking",
                "Jumat, 15 Januari 2021",
                "Webinar STIKOM IMA Proudly Present \uD83C\uDF89\uD83C\uDF89\n" +
                        "\n" +
                        "WEBINAR ONLINE\n" +
                        "\n" +
                        "\"MEMBANGUN KEWIRAUSAHAAN MELALUI PUBLIC SPEAKING”\n" +
                        "\n" +
                        "\uD83D\uDCCC SAVE THE DATE!\n" +
                        "\n" +
                        "\uD83D\uDDD3️ Sabtu, 16 Januari 2021\n" +
                        "\n" +
                        "⏰ 13.00 s/d 15.10 WIB\n" +
                        "\n" +
                        "\uD83D\uDCF9 Zoom Meeting dan Live Youtube STIKOM IMA Official (link akan dikirim setelah peserta mendaftar)\n" +
                        "\n" +
                        "\uD83D\uDCDD Tema : MEMBANGUN KEWIRAUSAHAAN MELALUI PUBLIC SPEAKING\n" +
                        "\n" +
                        "NARASUMBER :\n" +
                        "\n" +
                        "1. Tri Yulistyarani S.Si, M.Si (Praktisi PR & Dosen Public Speaking Stikom ima)\n" +
                        "\n" +
                        "2. Wildhan Ahmad Irfani, S. H. I (Pengelola Depota Cafe Bondowoso)\n" +
                        "\n" +
                        "MODERATOR :\n" +
                        "\n" +
                        "\uD83D\uDDE3 Arivia Fadillah ( Mahasiswi STIKOM-IMA)\n" +
                        "\n" +
                        "\uD83D\uDCCB For Registration :\n" +
                        "\n" +
                        "https://bit.ly/webinarstikom\n" +
                        "\n" +
                        "\uD83D\uDCDE For more Information :\n" +
                        "\n" +
                        "Dwiky : 0895 - 2480 - 8563\n" +
                        "\n" +
                        "Genta : 0812 - 1091 - 2491",
                "https://bit.ly/webinarstikom"
        ))
        partList.add(SeminarData(R.drawable.seminar9,
                "Perkembangan Telehealth dan Ancaman Eskalasi Obesitas di Masa Pandemi",
                "Sabtu, 16 Januari 2021",
                "\uD83D\uDD09 ATTENTION PLEASE \uD83D\uDD09\n" +
                        "Assalamualaikum wr wb\n" +
                        "Hello Everyone\uD83D\uDC4B\n" +
                        "➖ ➖ ➖ ➖ ➖\n" +
                        "\n" +
                        "Reguler 5C Kesehatan Masyarakat Fakultas Ilmu Kesehatan UIKA Bogor proudly present :\n" +
                        "\n" +
                        "Webinar Kesehatan Nasional Dengan tema:\n" +
                        "✨ *Perkembangan Telehealth dan Ancaman Eskalasi Obesitas di Masa Pandemi* ✨\n" +
                        "\n" +
                        "\uD83D\uDCDD Narasumber :\n" +
                        "\uD83D\uDD0A1. Prof. dr. Abdul Kadir, Ph.D, Sp.THT-KL(K), MARS\n" +
                        "(Direktur Jenderal Pelayanan Kesehatan Kementerian Kesehatan RI)\n" +
                        "Topik : Strategi Layanan Kesehatan Untuk Penanganan Penyakit Kronis Melalui Telehealth di Masa Pandemi\n" +
                        "\n" +
                        "\uD83D\uDD0A2. Husnah Maryati, S.KM, M.KM\n" +
                        "(Ikatan Ahli Kesehatan Masyarakat Indonesia)\n" +
                        "Topik: Ancaman Eskalasi Obesitas Dibalik Pandemi\n" +
                        "\n" +
                        "\uD83D\uDD0A3. Indira Chotimah S.K.M., M.K.M\n" +
                        "( Dosen Fakultas Ilmu Kesehatan UIKA Bogor )\n" +
                        "Topik: Inovasi Telehealth Dalam Perspektif Kesmas di Masa Pandemi.\n" +
                        "\n" +
                        "\uD83D\uDCDD Moderator :\n" +
                        "Siti Khodijah Parinduri S.K.M., M.K.M\n" +
                        "(Dosen Fakultas Ilmu Kesehatan UIKA Bogor )\n" +
                        "\n" +
                        "Waktu Pelaksanaan :\n" +
                        "\uD83D\uDCC6 Sabtu, 16 Januari 2021\n" +
                        "⏰ Pukul 13.00 WIB – s/d selesai\n" +
                        "\uD83D\uDCF1 Platform: ZOOM Meeting\n" +
                        "\n" +
                        "Benefit mengikuti webinar ini :\n" +
                        "\uD83D\uDCC4E-Sertifikat Ber- SKP\n" +
                        "\uD83D\uDCD2Ilmu Yang Bermanfaat\n" +
                        "\uD83D\uDCE6 Doorprize\n" +
                        "\uD83D\uDC6B Relasi Atau Teman Baru\n" +
                        "\n" +
                        "\uD83D\uDCB8 HTM\n" +
                        "Presale I : Rp. 20.000\n" +
                        "Presele II : Rp. 30.000\n" +
                        "\n" +
                        "\uD83D\uDCB3 PEMBAYARAN\n" +
                        "1. Dana :\n" +
                        "(089696684969) a/n Mutiara Candra\n" +
                        "2. BRI :\n" +
                        "080701049124534 a/n Muthia Azka\n" +
                        "\n" +
                        "Link pendaftaran:\n" +
                        "https://bit.ly/SemNasKesTelehealth\n" +
                        "\n" +
                        "\uD83D\uDD0EINFO LEBIH LANJUT\n" +
                        "Contact Person :\n" +
                        "\uD83D\uDCF2 0858-9912-6121 (Aulia Anwar)\n" +
                        "\uD83D\uDCF2 0899-4336-175 (Arissanti Isra Firdausy)\n" +
                        "\n" +
                        "\uD83D\uDD0E Find Us On Instagram : @semkesnas_telehealth\n" +
                        "\n" +
                        "Sampai Jumpa di webinar kami everyone \uD83D\uDC4B",
                "https://docs.google.com/forms/d/e/1FAIpQLScDjrGGsyIuqg6kuXvXYoALEYnbx1R38HBrWyXqs21cYbcatg/viewform"
        ))
        partList.add(SeminarData(R.drawable.seminar7,
                "UU Cipta Kerja Dari Kacamata Legal, Pajak & Dampaknya Pada Penerapan Audit",
                "Rabu, 20 Januari 2021",
                "Good evening, Future Auditors!\n" +
                        "\n" +
                        "The 20th ATV in collaboration with Grant Thornton present:\n" +
                        "\n" +
                        "\"UU Cipta Kerja dari Kacamata Legal, Pajak & Dampaknya pada Penerapan Audit\"\n" +
                        "\n" +
                        "This webinar talkshow will be held on:\n" +
                        "Date: Wednesday, January 20th 2021\n" +
                        "Time: 13.00 WIB\n" +
                        "Via: Zoom\n" +
                        "\n" +
                        "Introducing our distinguished speakers:\n" +
                        "- Alexander A. Tjahjadi (Partner Audit & Assurances)\n" +
                        "- Juanita Pribadi (Tax & Customs Partner)\n" +
                        "- Kurniawan Tjoetiar (Partner Legal & Services)\n" +
                        "\n" +
                        "Along with our moderator:\n" +
                        "- Hanny Prasetyo (Head and Partner of Audit & Assurances)\n" +
                        "\n" +
                        "Besides getting a lot of insights from this webinar for FREE, you will also get e-certificate from Grant Thornton Indonesia. (Worth 1 KUM for FEB UI students)\n" +
                        "\n" +
                        "What are you waiting for? Register now and save the date!\n" +
                        "\n" +
                        "Kindly check here to register:\n" +
                        "http://bit.ly/WebinarATV-GT\n" +
                        "\n" +
                        "For further information please contact:\n" +
                        "WhatsApp: 087882470053 (Balqisa)",
                "http://bit.ly/WebinarATV-GT"
        ))
        return partList
    }
}